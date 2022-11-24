$(function() {
		$("#submit").click(function() {
			$.ajax({
				url: "/post",
				type: "POST",
				data: $("form").serialize(),
				dataType: "json",
				timespan: 1000,
			})
			.done(function(testForm) {
				$("#content_name").text(testForm["name"]);
				$("#content_age").text(testForm["age"]);
				$("#content_gender").text(testForm["gender"]);
			})
			.fail(function(jqXHR) {
				console.log(jqXHR.status);
			})
			.always(function() {
				console.log("完了");
			})
		})
	})