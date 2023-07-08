<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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