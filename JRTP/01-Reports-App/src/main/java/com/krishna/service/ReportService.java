//time- 00:23:37
package com.krishna.service;

import java.util.List;

import com.krishna.entity.CitizenPlan;
import com.krishna.request.SearchRequest;

public interface ReportService {
	
	public List<String> getPlanNames();
	
	public List<String> getPlanStatuses();
	
	public List<CitizenPlan> search(SearchRequest request);
	
	public boolean exportExcel();
	
	public boolean exportPdf();
	
	
	
}
