package com.cloud.loanApproval.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.loanApproval.model.LoanApplication;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long>  {

	List<LoanApplication> findByUserId(String userId);

	LoanApplication findByApplicationId(Long applicationId);
}
