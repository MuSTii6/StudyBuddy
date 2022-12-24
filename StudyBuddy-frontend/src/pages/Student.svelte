<script>
    import axios from "axios";

    // TODO: Setze hier die URL zu deinem mit Postman erstellten Mock Server
    const api_root = "http://localhost:8080";

    let students = [];
    let student = {
        email: null,
        name: null,
    };

    function getStudents() {
        var config = {
            method: "get",
            url: api_root + "/api/student",
            headers: {},
        };

        axios(config)
            .then(function (response) {
                students = response.data;
            })
            .catch(function (error) {
                alert("Could not get Students");
                console.log(error);
            });
    }
    getStudents();

    function createStudent() {
        var config = {
            method: "post",
            url: api_root + "/api/student",
            headers: {
                "Content-Type": "application/json",
            },
            data: student,
        };

        axios(config)
            .then(function (response) {
                alert("Student created");
                getJobs();
            })
            .catch(function (error) {
                alert("Could not create Student");
                console.log(error);
            });
    }
</script>
<br>
<br>
<br>
<h1 class="mt-3">Als Lernpartner registrieren</h1>
<form class="mb-5">
    <div class="row mb-3">
        <div class="col">
            <label class="form-label" for="email">Mailadresse</label>
            <input
                bind:value={student.email}
                class="form-control"
                id="email"
                type="text"
            />
        </div>
    </div>
    <div class="row mb-3">
        <div class="col">
            <label class="form-label" for="name">Name</label>
            <input
                bind:value={student.name}
                class="form-control"
                id="name"
                type="text"
            />
        </div>
        
    </div>
    <button type="button" class="btn btn-primary" on:click={createStudent}
        >Submit</button
    >
</form>

<h1>Liste registrierter Studenten</h1>
<table class="table">
    <thead>
        <tr>
            <th scope="col">E-Mail</th>
            <th scope="col">Name</th>
        </tr>
    </thead>
    <tbody>
        {#each students as student}
            <tr>
                <td>{student.email}</td>
                <td>{student.name}</td>
            </tr>
        {/each}
    </tbody>
</table>
