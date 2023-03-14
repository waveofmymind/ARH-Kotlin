package com.wave.arh.domain.problem.domain

import jakarta.persistence.*
import lombok.AccessLevel
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor

@Entity
@Table(name = "tag")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
class Tag(


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tag_id")
    val id: Long,

    @Column(name = "tag_name")
    val tagName: String
) {

}
