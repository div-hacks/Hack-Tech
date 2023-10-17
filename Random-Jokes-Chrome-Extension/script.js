// https://icanhazdadjoke.com/slack

fetch('https://icanhazdadjoke.com/slack')
    .then(data => data.json())
    .then(jokeData => {
        const jokeText = jokeData.attachments[0].text;
        let para = document.getElementById('joke');
        para.innerHTML = jokeText;
    }) 
    

