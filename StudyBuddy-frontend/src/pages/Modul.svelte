<script>
    import axios from "axios";

    const api_root = "http://localhost:8080";

    let module = [];
    let modul = {
        modulname: null,
        studentId: null,
    };

    function getModul() {
        var config = {
            method: "get",
            url: api_root + "/api/modul",
            headers: {},
        };

        axios(config)
            .then(function (response) {
                module = response.data;
            })
            .catch(function (error) {
                alert("Could not get module");
                console.log(error);
            });
    }
    getModul();

    function createModul() {
        var config = {
            method: "post",
            url: api_root + "/api/modul",
            headers: {
                "Content-Type": "application/json",
            },
            data: modul,
        };

        axios(config)
            .then(function (_response) {
                alert("Modul created");
                getModul();
            })
            .catch(function (error) {
                alert("Could not create Modul");
                console.log(error);
            });
    }
</script>
<br>
<br>

<h1 class="mt-3">Modul hinzufügen</h1>
<form class="mb-5">
    <div class="row mb-3">
        <div class="col">
            <label class="form-label" for="modulname">Modulname</label>
            <input
                bind:value={modul.modulname}
                class="form-control"
                id="modulname"
                type="text"
            />
        </div>
    </div>
    
    <button type="button" class="btn btn-primary" on:click={createModul}
        >Hinzufügen</button
    >
</form>

<h1>Alle Module</h1>
<table class="table">
    <thead>
        <tr>
            <th scope="col">Modulname</th>
            <th scope="col">StudentId</th>
           
        </tr>
    </thead>
    <tbody>
        {#each module as modul}
            <tr>
                <td>{modul.modulname}</td>
                <td>{modul.studentId}</td>
            </tr>
        {/each}
    </tbody>
</table>
