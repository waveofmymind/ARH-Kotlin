package com.wave.arh.domain.review

import Problem
import jakarta.persistence.*
import lombok.AccessLevel
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.NoArgsConstructor

@Entity
@Table(name="review")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
class Review (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id", updatable = false)
    val id: Long,

    @ManyToOne
    @JoinColumn(name="problem_id", updatable = false)
    var problem: Problem,

    var content : String,


) {

}