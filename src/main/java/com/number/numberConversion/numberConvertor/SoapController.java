

package com.number.numberConversion.numberConvertor;

import com.number.numberConversion.soapservice.NumberToWords;
import com.number.numberConversion.soapservice.NumberToWordsResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoapController {
    
    @Autowired
	private SoapClient client;

	@PostMapping("/convert")
	public NumberToWordsResponse numberToWordsResponse(@RequestBody NumberToWords request){
		return client.getWords(request);
    }
    
}






