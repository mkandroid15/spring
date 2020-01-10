/**
 * @author Mehmet
 *
 * 22 Eyl 2018
 *
 * 11:16:18
 */

package tr.com.sbf.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import tr.com.sbf.repository.DBFile;
import tr.com.sbf.repository.DBFileRepository;

@Service
public class DBFileStorageService {

	@Autowired
	private DBFileRepository dbFileRepository;

	public DBFile storeFile(MultipartFile file) throws Exception {

		// Normalize file name
		final String fileName = StringUtils.cleanPath(file.getOriginalFilename());

		try {
			// Check if the file's name contains invalid characters
			if (fileName.contains("..")) {
				throw new Exception("Sorry! Filename contains invalid path sequence " + fileName);
			}

			final DBFile dbFile = new DBFile(fileName, file.getContentType(), file.getBytes());

			return this.dbFileRepository.save(dbFile);
		} catch (final IOException ex) {
			throw new Exception("Could not store file " + fileName + ". Please try again!", ex);
		}
	}

	public DBFile getFile(String fileId) throws Exception {
		return this.dbFileRepository.findById(fileId)
				.orElseThrow(() -> new Exception("File not found with id " + fileId));
	}

}
