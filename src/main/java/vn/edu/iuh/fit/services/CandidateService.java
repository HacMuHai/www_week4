package vn.edu.iuh.fit.services;

import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.daos.CandidateDAO;
import vn.edu.iuh.fit.models.Candidate;

import java.util.List;

@Component
public class CandidateService {
    private final CandidateDAO candidateDAO;

    public CandidateService(CandidateDAO candidateDAO) {
        this.candidateDAO = candidateDAO;
    }

    public List<Candidate> getAll() {
        return candidateDAO.getAll();
    }

    public boolean create(Candidate candidate) {
        return candidateDAO.create(candidate);
    }
}
