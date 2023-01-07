package com.xworkz.services.service;

import com.xworkz.services.dto.BekaryDTO;
import com.xworkz.services.exception.InvalidBekarydata;

public interface BekaryService {
	boolean validateAndSave(BekaryDTO dto) throws InvalidBekarydata;

}
