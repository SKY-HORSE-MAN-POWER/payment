package com.sparos4th2.payment.common;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseCreateTimeEntity {

	@CreatedDate
	@Column(updatable = false)
	private LocalDateTime paymentAt;

	public BaseCreateTimeEntity() {
		this.paymentAt = LocalDateTime.now(); // 현재 시간으로 설정
	}
}