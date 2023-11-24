package vn.edu.iuh.fit.ids;

import lombok.Getter;
import lombok.Setter;
import vn.edu.iuh.fit.models.Job;
import vn.edu.iuh.fit.models.Skill;

@Setter @Getter
public class JobSkillID {
    private Job job;
    private Skill skill;
}
