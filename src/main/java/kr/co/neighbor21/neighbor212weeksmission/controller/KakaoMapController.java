package kr.co.neighbor21.neighbor212weeksmission.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("kakao-map")
public class KakaoMapController {

    @GetMapping("/main")
    public String mainPage(@RequestParam(defaultValue = "Guest") String name, Model model) {

        model.addAttribute("name", name);
        return "MainPage";
    }

    @GetMapping("/api/geo-info")
    @ResponseBody
    public List<Map<String, Object>> getGeoInfo() throws IOException {
        // 정적 파일 경로 지정
        ClassPathResource resource = new ClassPathResource("static/link.json");

        // link.json 파일 읽기
        ObjectMapper objectMapper = new ObjectMapper();
        String geoJsonInfo = new String(Files.readAllBytes(resource.getFile().toPath()));

        // 읽어들인 JSON 파일 데이터를 List<Map<String, Object>> 형태로 변환하여 반환
        // ex) [ { "order":1, "longitude": 129.0845165, "latitude": 35.84498252}, .... ]
        return objectMapper.readValue(geoJsonInfo, new TypeReference<>() {
        });
    }
}
