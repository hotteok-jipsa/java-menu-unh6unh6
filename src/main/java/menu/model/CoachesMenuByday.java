package menu.model;

import java.util.List;
import java.util.stream.Collectors;
import menu.dto.CoachMenuByDayDto;

public class CoachesMenuByday {
    private final List<CoachMenuByDay> coachesMenuByDay;

    public CoachesMenuByday(List<CoachMenuByDay> coachesMenuByDay) {
        this.coachesMenuByDay = coachesMenuByDay;
    }

    public List<CoachMenuByDayDto> getCoachMenuByDayDtos() {
        return coachesMenuByDay.stream()
                .map(CoachMenuByDay::getCoachMenuByDayDto)
                .collect(Collectors.toList());
    }
}
