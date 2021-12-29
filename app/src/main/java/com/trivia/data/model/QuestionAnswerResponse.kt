package com.trivia.data.model

import com.google.gson.annotations.SerializedName

data class Category(

	@field:SerializedName("clues_count")
	val cluesCount: Int? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("title")
	val title: String? = null
)

data class QuestionAnswerResponseItem(

	@field:SerializedName("answer")
	val answer: String? = null,

	@field:SerializedName("question")
	val question: String? = null,

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("category_id")
	val categoryId: Int? = null,

	@field:SerializedName("airdate")
	val airdate: String? = null,

	@field:SerializedName("created_at")
	val createdAt: String? = null,

	@field:SerializedName("invalid_count")
	val invalidCount: Any? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("category")
	val category: Category? = null,

	@field:SerializedName("value")
	val value: Int? = null,

	@field:SerializedName("game_id")
	val gameId: Any? = null
)
