package vn.edu.iuh.fit.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vn.edu.iuh.fit.enums.SkillType;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Skill {
    private UUID id;
    private String skillName;
    private String skillDescription;
    private SkillType type;
}
