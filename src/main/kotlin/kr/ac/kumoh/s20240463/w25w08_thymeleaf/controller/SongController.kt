package kr.ac.kumoh.s20240463.w25w08_thymeleaf.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController {
    @GetMapping("/songs/random")
    fun getRandomSong() : String {
        return "random"
    }
}