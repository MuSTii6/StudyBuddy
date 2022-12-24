<script>
    import axios from "axios";

    const api_root = "http://localhost:8080";

    let bymodule = [];
    let student = {
        email: null,
        name: null,
    }
  
    function getBymodul() {
        var config = {
            method: "get",
            url: api_root + "/api/modul/bymodul",
            headers: {},
        };

        axios(config)
            .then(function (response) {
                bymodule = response.data;
            })
            .catch(function (error) {
                alert("Could not get module");
                console.log(error);
            });
    }
    getBymodul();
</script>


<br>
<br>
<br>
<br>
<br>



<h1>Module und zugewiesene Studenten</h1>
<table class="table">
    <thead>
        <tr>
            <th scope="col">Modulname</th>
            <th scope="col">StudentId</th>
        </tr>
    </thead>
    <tbody>
        {#each bymodule as bymodul}
            <tr>
                <td>{bymodul.id}</td>
                <td>{bymodul.studenten}</td>

            </tr>
        {/each}
    </tbody>
</table>

<br>
<br>
<br>


<h1>Student kontaktieren für eine Lernpartnerschaft</h1>

<form action="https://formsubmit.co/uzdilmus@students.zhaw.ch" method="POST">
    <input type="hidden" name="_subject" value="Anfrage für Lernpartnerschaft"/><br>
    <h6>Gib hier deine Nachricht ein:</h6><input type="text" name="name" placeholder="Deine Nachricht" required style="width: 30em"/>
    <br>
    <br>
    <h6>Gib hier deine Mailadresse ein:</h6><input type="email" name="Mail des Absenders" placeholder="Deine Mailadresse" required style="width: 30em"/>
    <br>
    <br>
    <button type="submit">Senden</button>
    <input type="hidden" name="_captcha" value="false" />



</form>
