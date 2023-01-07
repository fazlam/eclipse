package com.xworkz.services.repository;

import com.xworkz.services.dto.BekaryDTO;
import com.xworkz.services.exception.BekaryLimitAexcced;

public interface BekaryERepository {
	
	boolean store(BekaryDTO dto)throws BekaryLimitAexcced;

}
