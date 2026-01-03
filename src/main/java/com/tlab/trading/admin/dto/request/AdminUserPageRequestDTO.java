package com.tlab.trading.admin.dto.request;

import lombok.Data;

@Data
public class AdminUserPageRequestDTO {
	  private int page = 1;   
	  private int size = 20;  
	  private int offset;     
	  
	  public void normalize() {
		  if (page < 1) page = 1;
		  if (size < 1) size = 20;
		  if (size > 100) size = 100;
		  offset = (page - 1) * size;
		}

}
