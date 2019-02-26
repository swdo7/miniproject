<!DOCTYPE html>
<html lang="en">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<head>

  <meta charset="utf-8">
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  

  <title>SB Admin 2 - Register</title>

  <!-- Custom fonts for this template-->
  <link href="./resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="./resources/css/sb-admin-2.min.css" rel="stylesheet">
  
  <script src="./resources/js/jquery-3.3.1.min.js"></script>

<script>
$(function(){
	$('#joinAccount').on('click', insert);
	
});

//회원 가입 정보 전송
function insert(){
	
 	var name = $('#exampleFirstName').val();
	var pw = $('#exampleInputPassword').val();
	var email = $('#exampleInputEmail').val();
	if(name==''||pw==''||email=='') return;
	
	//회원 가입 저장
 	$.ajax({
		url: 'insert',
		type: 'get',
		data: $('#user').serialize(),
		success: function(){
			alert('저장되었습니다.');
			//콘솔로 확인
			console.log("success");
			//ajax실행 다 하고 돌아온 다음에 로그인 페이지로 이동하자! 
			location.href='http://localhost:8888/mini/login.html';
		},
		error: function(e){
			alert(JSON.stringify(e));
		}
	});
}
</script>

</head>

<body class="bg-gradient-primary">

  <div class="container">

    <div class="card o-hidden border-0 shadow-lg my-5">
      <div class="card-body p-0">
        <!-- Nested Row within Card Body -->
        <div class="row">
          <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
          <div class="col-lg-7">
            <div class="p-5">
              <div class="text-center">
                <h1 class="h4 text-gray-900 mb-4">회원 가입</h1>
              </div>
              <form class="user" id="user">
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="text" name="name" class="form-control form-control-user" id="exampleFirstName" placeholder="First Name">
                  </div>
                  <div class="col-sm-6">
                    <input type="text" class="form-control form-control-user" id="exampleLastName" placeholder="Last Name">
                  </div>
                </div>
                <div class="form-group">
                  <input type="email" name="email" class="form-control form-control-user" id="exampleInputEmail" placeholder="Email Address">
                </div>
                <div class="form-group row">
                  <div class="col-sm-6 mb-3 mb-sm-0">
                    <input type="password" name="password" class="form-control form-control-user" id="exampleInputPassword" placeholder="8~13자 적어주세요">
                  </div>
                  <div class="col-sm-6">
                    <input type="password" class="form-control form-control-user" id="exampleRepeatPassword" placeholder="Repeat Password">
                  </div>
                </div>
                <!-- 
                <a href="login" class="btn btn-primary btn-user btn-block" id="joinAccount">
                  	계정 등록
                </a> -->
                <input type="button" class="btn btn-primary btn-user btn-block" id="joinAccount" value="계정 등록">
                <!-- 
                	부트스트랩의 폐해.. a링크는 페이지를 떠나버리므로 Ajax의 success부분으로 돌아오지 않는다
                	
                 -->
                
                <hr>
                <a href="index" class="btn btn-google btn-user btn-block">
                  <i class="fab fa-google fa-fw"></i> Register with Google
                </a>
                <a href="index" class="btn btn-facebook btn-user btn-block">
                  <i class="fab fa-facebook-f fa-fw"></i> Register with Facebook
                </a>
              </form>
              <hr>
              <div class="text-center">
                <a class="small" href="forgot-password.html">Forgot Password?</a>
              </div>
              <div class="text-center">
                <a class="small" href="login.html">Already have an account? Login!</a>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

  </div>

  <!-- Bootstrap core JavaScript-->
  <script src="./resources/vendor/jquery/jquery.min.js"></script>
  <script src="./resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="./resources/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="./resources/js/sb-admin-2.min.js"></script>

</body>

</html>
