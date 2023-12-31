package vn.edu.iuh.fit.daos;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.ids.CandidateSkillID;
import vn.edu.iuh.fit.models.CandidateSkill;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@Component
public class CandidateSkillDAO extends AbstractDAO<CandidateSkill, CandidateSkillID> {

    public CandidateSkillDAO(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public boolean create(CandidateSkill candidateSkill) {
        String sql = "INSERT candidate_skill VALUES (?,?,?,?)";
        int updated = jdbcTemplate.update(sql, candidateSkill.getSkillLevel().getValue(), candidateSkill.getMoreInfomation(), candidateSkill.getSkill().getId(), candidateSkill.getCandidate().getId());
        return updated > 0;
    }

    @Override
    public List<CandidateSkill> getAll() {
        String sql = "SELECT * FROM candidate_skill";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(CandidateSkill.class));
    }

    @Override
    public Optional<CandidateSkill> findById(CandidateSkillID candidateSkillID) {
        return null;
    }

    @Override
    public boolean update(CandidateSkill candidateSkill) {
        String sql = "UPDATE candidate_skill SET more_infos = ?, skill_level = ? WHERE skill_id = ? and can_id = ?";
        int updated = jdbcTemplate.update(sql, candidateSkill.getMoreInfomation(), candidateSkill.getSkillLevel().getValue(), candidateSkill.getSkill().getId(), candidateSkill.getCandidate().getId());
        return updated > 0;
    }

    @Override
    public boolean delete(CandidateSkillID candidateSkillID) {
        String sql = "DELETE FROM candidate_skill WHERE skill_id = ? and can_id = ?";
        int updated = jdbcTemplate.update(sql, candidateSkillID.getSkill().getId(), candidateSkillID.getCandidate().getId());
        return updated > 0;
    }
}
