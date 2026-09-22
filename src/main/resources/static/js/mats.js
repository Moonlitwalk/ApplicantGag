fetch("/api/mats")
    .then(response =>response.json())
    .then(applicant => {
        document.getElementById("applicant").textContent =
            JSON.stringify(applicant,null,2);
    })