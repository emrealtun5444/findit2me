package tr.com.kare.recommendation.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tr.com.kare.servicecommon.dto.SistemParametreDto;

@FeignClient(name="account-service")
public interface AdminServiceProxy {
	
	@GetMapping("/account-service/sistem-parametre/kod/{kod}")
	public SistemParametreDto getSistemParametre(
			@PathVariable String kod);

}
