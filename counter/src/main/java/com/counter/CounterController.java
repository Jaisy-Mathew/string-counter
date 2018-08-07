/**
 * @author Jaisy Mathew
 *
 */
package com.counter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counter-api")
public class CounterController {
	
	@Autowired
	private CounterService counterService;
	
	 @RequestMapping(value = "/search", method = RequestMethod.POST , produces = MediaType.APPLICATION_JSON_VALUE)
	 public CounterResponse search(@RequestBody CounterRequest counterRequest) {
		 CounterResponse counterResponse = counterService.search(counterRequest);
		 return counterResponse;
	 }
	 @RequestMapping(value = "/top/{count}", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	 public String topCount(@PathVariable(value = "count") int count) {
		 String counterResponse = counterService.topCount(count);
		 return counterResponse;
	 }
}
