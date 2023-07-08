<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="">
		<meta name="author" content="Nguyen Thanh Trung">
		<meta name="generator" content="version 2">
		<title>Thiết kế tổng hợp Bootstrap v5.2</title>

		<link href="/home/css/all.min.css" rel="stylesheet">
		<link href="/home/css/bootstrap.min.css" rel="stylesheet">


		
		<!-- Custom styles for this template -->
		<link href="/home/css/main.css" rel="stylesheet">
		<script language = "javascript" src ="/home/js/main.js" ></script>
	</head>
	<body onload = "setFirstTime_v2(document.frmSearch)">
		<!-- HEADER -->
		
		<nav class="py-2 bg-light border-bottom">
			<div class="container d-flex flex-wrap">
				<ul class="nav me-auto">
					<li class="nav-item"><a href="#" class="nav-link link-dark px-2 active" aria-current="page">Home</a></li>
					<li class="nav-item"><a href="#" class="nav-link link-dark px-2">Features</a></li>
					<li class="nav-item"><a href="#" class="nav-link link-dark px-2">Pricing</a></li>
					<li class="nav-item"><a href="#" class="nav-link link-dark px-2">FAQs</a></li>
					<li class="nav-item"><a href="#" class="nav-link link-dark px-2">About</a></li>
				</ul>
				<ul class="nav">
					<li class="nav-item"><a href="#" class="nav-link link-dark px-2">Login</a></li>
					<li class="nav-item"><a href="#" class="nav-link link-dark px-2">Sign up</a></li>
				</ul>
			</div>
		</nav>
			<header class="py-3 mb-4 border-bottom">
				<div class="container d-flex flex-wrap justify-content-center">
				
					<a href="#" class="d-flex align-items-center mb-3 mb-lg-0 me-lg-auto text-dark text-decoration-none">
						<img class="myimgs" src="/home/imgs/logo.jpg" />						
						<span class="fs-4">Lambo Shop</span>
					</a>
				  
					<form class="d-flex" role="search" name = "frmSearch">
						<input class="form-control me-2" type="search" id="txtKeyword" name="txtKeyword" onClick = "setKeyword(this.form, true)" onBlur="setKeyword(this.form, false)">
						<button class="btn btn-outline-success" type="button" onclick="checkValidKeyword(this.form)"><i class="fa-solid fa-magnifying-glass"></i></button>
					</form>
				</div>
			</header>
			
		<!-- SLIDER -->
		
			<div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="false">
			<div class="carousel-indicators">
				<button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
				<button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
				<button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
			</div>
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="/home/images/slider4.jpg" class="d-block w-100" alt="...">
					<div class="carousel-caption d-none d-md-block">
						<h5>First slide label</h5>
						<p>Some representative placeholder content for the first slide.</p>
					</div>
				</div>
				<div class="carousel-item">
					<img src="/home/images/slider5.jpg" class="d-block w-100" alt="...">
					<div class="carousel-caption d-none d-md-block">
						<h5>Second slide label</h5>
						<p>Some representative placeholder content for the second slide.</p>
					</div>
				</div>
				<div class="carousel-item">
					<img src="/home/images/slider6.jpg" class="d-block w-100" alt="...">
					<div class="carousel-caption d-none d-md-block">
						<h5>Third slide label</h5>
						<p>Some representative placeholder content for the third slide.</p>
					</div>
				</div>
			</div>
			<button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
				<span class="carousel-control-prev-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Previous</span>
			</button>
			<button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
				<span class="carousel-control-next-icon" aria-hidden="true"></span>
				<span class="visually-hidden">Next</span>
			</button>
			</div>
		
		<!-- FEATURES -->
		<div class="container-lg my-5">
			<div class="card text-center">
			  <div class="card-header">
				Featured
			  </div>
			  <div class="card-body">
				<h5 class="card-title">Special title treatment</h5>
				<p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
				<a href="#" class="btn btn-primary">Go somewhere</a>
			  </div>
			  <div class="card-footer text-muted">
				2 days ago
			  </div>
			</div>
		</div>
		
		<!-- news -->
		<div class="container-lg my-5">
			<div class="row my-3">
				<div class="col-md-12 text-center">
				<h3>Tin tức mới <span class="badge bg-secondary">New</span></h3>
			</div>
			</div>
			
		
			<div class="row row-cols-2 row-cols-md-3 g-4">
			  <div class="col">
				<a href="#" class="link-primary">
					<div class="card">
					<div class="card-img-crop hovergallery">
						<img src="/home/images/anh1.png" class="card-img-top" alt="...">
					</div>			  
					  <div class="card-body">
						<h5 class="card-title">Bác sĩ cấp cứu bị chửi mắng 'như cơm bữa'</h5>
						<p class="card-text">Sự việc xảy ra ở Bệnh viện Nhân dân Gia Định mới đây, được camera phòng cấp cứu ghi lại. Người xông vào phòng cấp cứu liên tục buông lời tục tĩu, mắng chửi các y bác sĩ vì đã để người nhà họ "chờ mấy tiếng không thăm khám", yêu cầu phải cắt cử người trông coi, chăm sóc bệnh nhân 24/24.</p>
					  </div>
					</div>
				</a>
			  </div>
			  <div class="col">
			  <a href="#" class="link-primary">
				<div class="card">
					<div class="card-img-crop hovergallery">
						<img src="/home/images/anh2.png" class="card-img-top" alt="...">
					</div>
				  <div class="card-body">
					<h5 class="card-title">Kiểm duyệt cảnh 'nóng' phim Việt thiếu tiêu chí</h5>
					<p class="card-text">Câu chuyện kiểm duyệt theo độ tuổi được nêu ra ở hội thảo do Bộ Văn hóa, Thể thao và Du lịch tổ chức, sáng 5/8 tại TP HCM. Nhiều tên tuổi trong làng phim cho rằng, hiện bảng tiêu chí còn nhiều bất cập, hạn chế do chưa có các quy định cụ thể.</p>
				  </div>
				</div>
			  </a>
				
			  </div>
			  <div class="col">
				<a href="#" class="link-primary">
					<div class="card">
						<div class="card-img-crop hovergallery">
					  <img src="/home/images/anh3.png" class="card-img-top" alt="..."></div>
					  <div class="card-body">
						<h5 class="card-title">Mùa chuyển nhượng 'quái gở' của Barca</h5>
						<p class="card-text">Họ cử ra một đại diện, trình UEFA một đề xuất. Barca muốn vay tiền dưới sự bảo đảm của UEFA để cải thiện tình trạng tài chính bắt nguồn từ việc chi tiêu vô tội vạ vào chuyển nhượng cầu thủ từ thời cựu chủ tịch Josep Maria Bartomeu.</p>
					  </div>
					</div>
				</a>
			  </div>
			  <!-- <div class="col"> -->
				<!-- <div class="card"> -->
				  <!-- <img src="/home/images/anh4.png" class="card-img-top" alt="..."> -->
				  <!-- <div class="card-body"> -->
					<!-- <h5 class="card-title">Nhiều dịch vụ du lịch đồng loạt giảm giá</h5> -->
					<!-- <p class="card-text">Trên website của Vietnam Airlines, giá vé máy bay khứ hồi chặng Hà Nội/TP HCM tới Đà Nẵng, một trong những điểm đến đông du khách nhất trong nước hè này, đã giảm 50-60% so với thời điểm cuối tháng 6 và đầu tháng 7.</p> -->
				  <!-- </div> -->
				<!-- </div> -->
			  <!-- </div> -->
			</div>
		</div>
		
		<!-- About -->
		<div class="container-fluid text-bg-light my-5">
			<div class="container-lg py-3">
				<div class="row my-3">
					<div class="col-md-12 text-center">
						<h2>Thông tin về chúng tôi</h2>
					</div>
				</div>
			</div>
			
			<div class="row ">
				<div class="col-md-5">
					<div class="card text-bg-dark">
					  <img src="/home/images/about.jpg" class="card-img" alt="...">
					  <div class="card-img-overlay">
						<h5 class="card-title">Đội ngũ</h5>
						<p class="card-text">Chúng tôi tự hào về các thành viên trong nhóm</p>
						<p class="card-text">Last updated 3 mins ago</p>
					  </div>
					</div>
				</div>
				<div class="col-md-5 offset-md-1">
					<ul class="nav nav-tabs" id="myTab" role="tablist">
					  <li class="nav-item" role="presentation">
						<button class="nav-link active" id="home-tab" data-bs-toggle="tab" data-bs-target="#home-tab-pane" type="button" role="tab" aria-controls="home-tab-pane" aria-selected="true">Home</button>
					  </li>
					  <li class="nav-item" role="presentation">
						<button class="nav-link" id="profile-tab" data-bs-toggle="tab" data-bs-target="#profile-tab-pane" type="button" role="tab" aria-controls="profile-tab-pane" aria-selected="false">Profile</button>
					  </li>
					  <li class="nav-item" role="presentation">
						<button class="nav-link" id="contact-tab" data-bs-toggle="tab" data-bs-target="#contact-tab-pane" type="button" role="tab" aria-controls="contact-tab-pane" aria-selected="false">Contact</button>
					  </li>
					  <li class="nav-item" role="presentation">
						<button class="nav-link" id="disabled-tab" data-bs-toggle="tab" data-bs-target="#disabled-tab-pane" type="button" role="tab" aria-controls="disabled-tab-pane" aria-selected="false" disabled>Disabled</button>
					  </li>
					</ul>
					<div class="tab-content" id="myTabContent">
					  <div class="tab-pane fade show active" id="home-tab-pane" role="tabpanel" aria-labelledby="home-tab" tabindex="0">
						The founder is an integral part of the brand’s origin story, so making her the star of the page works
					  </div>
					  <div class="tab-pane fade" id="profile-tab-pane" role="tabpanel" aria-labelledby="profile-tab" tabindex="0">
						<h5 class="mt-3">1. Establish a mission statement.</h5>
						Your About page can and will be more comprehensive than a single mission statement, but to draw people in, you need to succinctly state your goal in the industry upfront. What is your business here to do? Why should your website visitors care? This information will give the reader something to remember about your company long after they leave your website.
						</br>
						<h5>2. Outline your company story.</h5>
						Every business has a story to tell. Even if you're running a start-up, you might not have a long history of changes and growth (yet), but it's a nice touch to talk about how you got to where you are on the About page. So, isolate the milestones before your company's founding, and use them to give readers some backstory on your current venture.
						</br>
						<h5>3. Reveal how you've evolved.</h5>
						There's no shame in admitting how your business strategy — or even your way of thinking — has changed since you began. In fact, these evolutions can improve the story you tell to website visitors.
						</br>
					  </div>
					  <div class="tab-pane fade" id="contact-tab-pane" role="tabpanel" aria-labelledby="contact-tab" tabindex="0">...</div>
					  <div class="tab-pane fade" id="disabled-tab-pane" role="tabpanel" aria-labelledby="disabled-tab" tabindex="0">...</div>
					</div>
				
				</div>
			</div>
		</div>
		<!-- ASK -->
		<div class="container-lg my-5 text-bg-primary">
			<div class="row py-5">
				<div class="col-md-12 text-center">
					<h2>Câu hỏi thường gặp</h2>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12 pb-5">
					<div class="accordion accordion-flush" id="accordionFlushExample">
					  <div class="accordion-item">
						<h2 class="accordion-header" id="flush-headingOne">
						  <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseOne" aria-expanded="false" aria-controls="flush-collapseOne">
							<i class="fa-solid fa-hand-back-point-right"></i>&nbsp; Accordion Item #1
						  </button>
						</h2>
						<div id="flush-collapseOne" class="accordion-collapse collapse" aria-labelledby="flush-headingOne" data-bs-parent="#accordionFlushExample">
						  <div class="accordion-body">Placeholder content for this accordion, which is intended to demonstrate the <code>.accordion-flush</code> class. This is the first item's accordion body.</div>
						</div>
					  </div>
					  <div class="accordion-item">
						<h2 class="accordion-header" id="flush-headingTwo">
						  <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseTwo" aria-expanded="false" aria-controls="flush-collapseTwo">
							<i class="fa-solid fa-hand-back-point-right"></i> &nbsp; Accordion Item #2
						  </button>
						</h2>
						<div id="flush-collapseTwo" class="accordion-collapse collapse" aria-labelledby="flush-headingTwo" data-bs-parent="#accordionFlushExample">
						  <div class="accordion-body">Placeholder content for this accordion, which is intended to demonstrate the <code>.accordion-flush</code> class. This is the second item's accordion body. Let's imagine this being filled with some actual content.</div>
						</div>
					  </div>
					  <div class="accordion-item">
						<h2 class="accordion-header" id="flush-headingThree">
						  <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#flush-collapseThree" aria-expanded="false" aria-controls="flush-collapseThree">
							<i class="fa-solid fa-hand-back-point-right"></i> &nbsp;Accordion Item #3
						  </button>
						</h2>
						<div id="flush-collapseThree" class="accordion-collapse collapse" aria-labelledby="flush-headingThree" data-bs-parent="#accordionFlushExample">
						  <div class="accordion-body">Placeholder content for this accordion, which is intended to demonstrate the <code>.accordion-flush</code> class. This is the third item's accordion body. Nothing more exciting happening here in terms of content, but just filling up the space to make it look, at least at first glance, a bit more representative of how this would look in a real-world application.</div>
						</div>
					  </div>
					</div>
				</div>
			</div>
			
			
		</div>
		<!-- CONTACT -->
		<div class="container-fluid text-bg-success my-5">
			<div class="container-lg py-5">
				<div class="row align-items-start">
					<div class="col-md-6 text-bg-light py-5">
						<form class="row g-3">
						  <div class="col-md-4">
							<label for="validationDefault01" class="form-label">First name</label>
							<input type="text" class="form-control" id="validationDefault01" value="Mark" required>
						  </div>
						  <div class="col-md-4">
							<label for="validationDefault02" class="form-label">Last name</label>
							<input type="text" class="form-control" id="validationDefault02" value="Otto" required>
						  </div>
						  <div class="col-md-4">
							<label for="validationDefaultUsername" class="form-label">Username</label>
							<div class="input-group">
							  <span class="input-group-text" id="inputGroupPrepend2">@</span>
							  <input type="text" class="form-control" id="validationDefaultUsername"  aria-describedby="inputGroupPrepend2" required>
							</div>
						  </div>
						  <div class="col-md-6">
							<label for="validationDefault03" class="form-label">City</label>
							<input type="text" class="form-control" id="validationDefault03" required>
						  </div>
						  <div class="col-md-3">
							<label for="validationDefault04" class="form-label">State</label>
							<select class="form-select" id="validationDefault04" required>
							  <option selected disabled value="">Choose...</option>
							  <option>...</option>
							</select>
						  </div>
						  <div class="col-md-3">
							<label for="validationDefault05" class="form-label">Zip</label>
							<input type="text" class="form-control" id="validationDefault05" required>
						  </div>
						  <div class="col-12">
							<div class="form-check">
							  <input class="form-check-input" type="checkbox" value="" id="invalidCheck2" required>
							  <label class="form-check-label" for="invalidCheck2">
								Agree to terms and conditions
							  </label>
							</div>
						  </div>
						  <div class="col-12">
							<button class="btn btn-primary" type="submit">Submit form</button>
						  </div>
						</form>
					</div>
					
					<div class="col-md-5 offset-md-1 text-bg-light">
						<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3723.4737883168395!2d105.7329181147637!3d21.05373098598487!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31345457e292d5bf%3A0x20ac91c94d74439a!2zVHLGsOG7nW5nIMSQ4bqhaSBo4buNYyBDw7RuZyBuZ2hp4buHcCBIw6AgTuG7mWk!5e0!3m2!1svi!2s!4v1659841205867!5m2!1svi!2s" width="500" height="400" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
					</div>
				</div>
			</div>
		</div>
		<!-- FOOTER -->
		<div class="container-lg">
		  <footer class="py-5">
			<div class="row">
			  <div class="col-6 col-md-2 mb-3">
				<h5>Section</h5>
				<ul class="nav flex-column">
				  <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Home</a></li>
				  <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Features</a></li>
				  <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Pricing</a></li>
				  <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">FAQs</a></li>
				  <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">About</a></li>
				</ul>
			  </div>

			  <div class="col-6 col-md-2 mb-3">
				<h5>Section</h5>
				<ul class="nav flex-column">
				  <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Home</a></li>
				  <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Features</a></li>
				  <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Pricing</a></li>
				  <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">FAQs</a></li>
				  <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">About</a></li>
				</ul>
			  </div>

			  <div class="col-6 col-md-2 mb-3">
				<h5>Section</h5>
				<ul class="nav flex-column">
				  <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Home</a></li>
				  <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Features</a></li>
				  <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Pricing</a></li>
				  <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">FAQs</a></li>
				  <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">About</a></li>
				</ul>
			  </div>

			  <div class="col-md-5 offset-md-1 mb-3">
				<form>
				  <h5>Đăng kí để nhận được thông tin mới nhất</h5>
				  <p>Hằng ngày chúng tôi có nhưng chương trình và sự kiện hấp dẫn</p>
				  <div class="d-flex flex-column flex-sm-row w-100 gap-2">
					<label for="newsletter1" class="visually-hidden">Email address</label>
					<input id="newsletter1" type="text" class="form-control" placeholder="Địa chỉ email">
					<button class="btn btn-primary" type="button">Subscribe</button>
				  </div>
				</form>
			  </div>
			</div>

			<div class="d-flex flex-column flex-sm-row justify-content-between py-4 my-4 border-top">
			  <p>&copy; 2022 Kim Ngoc Sinh. All rights reserved.</p>
			  <ul class="list-unstyled d-flex">
				<li class="ms-3"><a class="link-dark" href="#"><i class="fa-brands fa-facebook"></i></a></li>
				<li class="ms-3"><a class="link-dark" href="#"><i class="fa-brands fa-twitter"></i></a></li>
				<li class="ms-3"><a class="link-dark" href="#"><i class="fa-brands fa-google"></i></a></li>
			  </ul>
			</div>
		  </footer>
		</div>

		<script src="/home/js/bootstrap.bundle.min.js"></script>

	</body>
</html>
