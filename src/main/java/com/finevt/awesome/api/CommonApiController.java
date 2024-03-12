
package com.finevt.awesome.api;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.finevt.awesome.exception.RestException;
import com.finevt.awesome.service.CommonService;


/**  
 * @Class Name : CommonApiController.java
 * @Description : Common API Controller Class
 * @Modification Information  
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2024.03.11   김기준         최초생성
 * 
 * @author 김기준
 * @since 2024. 03.11
 * @version 1.0
 * @see
 */

@RestController
@CrossOrigin
@RequestMapping("/hello")
public class CommonApiController {
	private final Log logger = LogFactory.getLog(getClass());
	
	@Autowired
	private CommonService commonService;
	
	@RequestMapping(value="/world", method=RequestMethod.GET)
	@ResponseStatus(value=HttpStatus.OK)
	public ResponseEntity<?> printHelloWorld(){
		try {
			JSONObject result = new JSONObject();
			result.put("message", commonService.getHelloWorld());

			JSONObject json = new JSONObject();
			json.put("status", true);
			json.put("result", result);
			
			return new ResponseEntity<>(json, HttpStatus.OK);
		} catch(Exception e) {
			e.printStackTrace();
			throw new RestException("9999", "fail.common.msg", null, HttpStatus.BAD_REQUEST);
		}
	}
}