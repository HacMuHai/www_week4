package vn.edu.iuh.fit.ids;

import lombok.Getter;
import lombok.Setter;
import vn.edu.iuh.fit.models.Candidate;
import vn.edu.iuh.fit.models.Skill;

@Setter
@Getter
public class CandidateSkillID {
    private Skill skill;
    private Candidate candidate;
}
