package vn.edu.iuh.fit.enums;

public enum SkillType {
    BEGINNER(0), INTERMEDIATE(1), MASTER(2);

    private int typeNum;

    private SkillType(int typeNum){
        this.typeNum = typeNum;
    }
}
