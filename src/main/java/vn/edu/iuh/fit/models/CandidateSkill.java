package vn.edu.iuh.fit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.edu.iuh.fit.enums.SkillLevel;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CandidateSkill {
    private SkillLevel skillLevel;
    private String moreInfomation;
    private Candidate candidate;
    private Skill skill;
}
