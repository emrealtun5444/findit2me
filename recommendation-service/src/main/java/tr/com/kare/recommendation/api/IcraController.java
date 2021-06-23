package tr.com.kare.recommendation.api;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.com.kare.recommendation.dto.IcraDto;
import tr.com.kare.recommendation.service.IcraService;

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
