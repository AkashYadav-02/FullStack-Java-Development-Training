<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
  href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
  rel="stylesheet"
  integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
  crossorigin="anonymous">
<script
  src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
  integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
  crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h2>User Information Form</h2>
  
  <div class=container mt-5  >
  <form  action="student-response.jsp" method ="get">
    <div class="form-group">
      <label for="name">Name:</label>
      <input type="text" class="form-control" id="name" name="name" required>
    </div>
      <div class ="form-group">
  
 <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" name="email" required>
    </div>
      <div class ="form-group">
  
  <label for="degree">Highest Degree: </label>
  <select class ="form-control" id="degree" name ="degree"  aria-haspopup="true" aria-expanded="false">
  <option Select>  choose</option>
  
  <option value="BE">  BE</option>
  <option value="BSC-IT">  BSC-IT</option>
  <option value="MBA">  MBA</option>
  <option value="PHD">  PHD</option>
  </select>
   
    </div>
    <div class="form-group">
      <label>Gender:</label>
      <div class="form-check">
        <input class="form-check-input" type="radio"  name="gender" value="male" required>
        <label class="form-check-label" for="male">Male</label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="radio"  name="gender" value="female" required>
        <label class="form-check-label" for="female">Female</label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="radio"  name="gender" value="other" required>
        <label class="form-check-label" for="other">Other</label>
      </div>
    </div>

    <div class="form-group">
      <label>Specialization:</label>
      <div class="form-check">
        <input class="form-check-input" type="checkbox" name="specialization" value="coding">
        <label class="form-check-label" for="coding">Coding</label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="checkbox"  name="specialization" value="dataScience">
        <label class="form-check-label" for="dataScience">Data Science</label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="checkbox"  name="specialization" value="visualization">
        <label class="form-check-label" for="visualization">Visualization</label>
      </div>
      <div class="form-check">
        <input class="form-check-input" type="checkbox"  name="specialization" value="database">
        <label class="form-check-label" for="database">Database</label>
      </div>
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>

  </form>
 
  </div>
    
    <script>
    const checkboxes = document.querySelectorAll('#specialization input[type="checkbox"]');
    checkboxes.forEach(checkbox => {
        checkbox.addEventListener('click', function() {
            checkboxes.forEach(cb => {
                if (cb !== this) {
                    cb.checked = false;
                }
            });
        });
    });
</script>
       
      
   

</body>
</html>