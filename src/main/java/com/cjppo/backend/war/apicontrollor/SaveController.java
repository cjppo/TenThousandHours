package com.cjppo.backend.war.apicontrollor;

import com.cjppo.backend.war.domain.Practice;
import com.cjppo.backend.war.domain.User;
import com.cjppo.backend.war.service.UserBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/save")
@RestController
public class SaveController {

    @Autowired
    private UserBuilder userBuilder;

    @PostMapping(value = "/updatepracticetime")
    public boolean updatePracticeTime(String uid, String practiceId, Long practiceTime_in_minute) {
        User user = userBuilder.buildUser(uid);
        if (user.getPractices() == null || user.getPractices().size() == 0) {
            return false;
        }

        Practice practice = user.getPractices().stream().filter(r -> r.getProjectId().equalsIgnoreCase(practiceId))
                .findFirst().orElse(null);
        if (practice != null) {
            practice.setLastingMinutes(practiceTime_in_minute);
        }

        return user.save();
    }
}
