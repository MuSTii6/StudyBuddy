<script>
	import Router from "svelte-spa-router";
	import routes from "./routes";



</script>

<div id="app">


	<div class="container">
		<Router {routes} />
	</div>
</div>




<nav class="navbar navbar-dark bg-dark fixed-top">
	<div class="container-fluid">
	  <a class="navbar-brand" style="margin-left:32em; color:aqua" href="#/">Welcome to StudyBuddy, the platform to prepare together for exams</a>
	  <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar">
		<span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
		<div class="offcanvas-header">
		  <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">StudyBuddy</h5>
		  <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
		</div>
		<div class="offcanvas-body">
		  <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
			<li class="nav-item">
			  <a class="nav-link active" aria-current="page" style="color: white; font-weight: bold" href="#/">Home</a>
			</li>
			<li class="nav-item">
			  <a class="nav-link" style="color: aqua; font-weight: bold" href="#/student">Studenten</a>
			</li>

			<li class="nav-item">
				<a class="nav-link" style="color: aqua; font-weight: bold" href="#/modul">Module</a>
			  </li>
			  <li class="nav-item">
				<a class="nav-link" style="color: aqua; font-weight: bold" href="#/bymodul">Module nach Studenten</a>
			  </li>
		  </ul>
		</div>
	  </div>
	</div>
  </nav>




 <style>


 </style>
