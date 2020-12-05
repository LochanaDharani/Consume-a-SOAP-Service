

package com.number.numberConversion.numberConvertor;

import com.number.numberConversion.soapservice.NumberToWords;
import com.number.numberConversion.soapservice.NumberToWordsResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapClient {
    
    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;

    public NumberToWordsResponse getWords(NumberToWords request){
        
        template = new WebServiceTemplate(marshaller);

        NumberToWordsResponse numberToWords = (NumberToWordsResponse) template
            .marshalSendAndReceive("http://www.dataaccess.com/webservicesserver/numberconversion.wso?WSDL", request);

        return numberToWords;

    }

}




