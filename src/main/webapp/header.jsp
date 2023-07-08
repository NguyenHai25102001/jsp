<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Quoc Toan">
    <meta name="generator" content="Version2">
    <title>Thiet ke tong hop</title>
    <link href="/home/css/all.min.css" rel="stylesheet">
    <link href="/home/css/bootstrap.min.css" rel="stylesheet">
	<link href="/home/css/reset.css" rel="stylesheet">
	<link href="/home/css/product.css" rel="stylesheet">
	<script src="/home/js/main.js"></script>
	<script src="/home/assets/js/main.js"></script>
 
    <!-- Custom styles for this template -->
	<link href="/home/css/main.css" rel="stylesheet">
	<link href="/home/css/blog.css" rel="stylesheet">
	<link href="/home/assets//css/main.css" rel="stylesheet">
	<script language="javascript" src="/homejs/main.js"></script>
   
  </head>
  <body onload="setFirstTime_v2(document.frmSearch)">
	<!-- HEADER--->
	<nav class="py-2 bg-light border-bottom">
		<div class="container d-flex flex-wrap">
		  <ul class="nav me-auto">
			<li class="nav-item"><a href="/home/" class="nav-link link-dark px-3 active" aria-current="page">Home</a></li>
			<li class="nav-item"><a href="/home/about/" class="nav-link link-dark px-3">About</a></li>
			<li class="nav-item"><a href="/home/news/" class="nav-link link-dark px-3">News</a></li>
			<li class="nav-item"><a href="/home/faq/" class="nav-link link-dark px-3">FAQs</a></li>
			<li class="nav-item"><a href="/home/product/" class="nav-link link-dark px-3">Products</a></li>
			<li class="nav-item"><a href="/home/contact/" class="nav-link link-dark px-3">Contact</a></li>
		  </ul>
		  <ul class="nav">
			<li class="nav-item"><a href="#" class="nav-link link-dark px-3">Login</a></li>
			<li class="nav-item"><a href="#" class="nav-link link-dark px-3">Sign up</a></li>
		  </ul>
		</div>
    </nav>
	
    <header class="py-3 mb-4 border-bottom">
		<div class="container d-flex flex-wrap justify-content-center">
			<a href="/" class="d-flex align-items-center mb-3 mb-lg-0 me-lg-auto text-dark text-decoration-none">
				<img src="/home/imgs/logo.png"   class="myimgs"/>
				<span class="fs-4">Double header</span>
			</a>
			<form class="d-flex" role="search" name="frmSearch" >
				<input class="form-control me-2" type="search" id="txtKeyword" name="txtKeyword"  onClick="setKeyword(this.form,true)" onblur="setKeyword(this.form,false)">
				<button class="btn btn-outline-success" type="button" onClick="checkValidKeyword(this.form)"><i class="fa-solid fa-magnifying-glass"></i></button>
			</form>
		</div>
	</header>
	
	
	
	<!-- MENU--->