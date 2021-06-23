package tr.com.kare.recommendation.api;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.com.kare.recommendation.service.IcraService;
import tr.com.kare.findit2me.icraservice.dto.IcraDto;

@RequestMapping("/recommendation-service")
@RestController
@RequiredArgsConstructor
public class IcraController {

    @Autowired
    private IcraService icraService;

    @PostMapping("/icra-olustur/dosyaNo/{dosyaNo}")
    public IcraDto icraAc(@PathVariable String dosyaNo) {
        return icraService.dosyaOlustur(dosyaNo);
    }


}
