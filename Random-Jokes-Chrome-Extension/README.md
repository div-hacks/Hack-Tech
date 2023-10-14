# Random-Jokes-Chrome-Extension

This is a API based projects that named _Random jokes Generator_. It uses an [JOKE API](https://icanhazdadjoke.com/slack) that gives you a new joke everytime.

So I integrate it with a extension by which you can click every time and get new joke.

API Documentation: https://icanhazdadjoke.com/api

API link: https://icanhazdadjoke.com/slack 

> **In response you will get:**
```
{
  "attachments": [
    {
      "fallback": "My first time using an elevator was an uplifting experience. The second time let me down.",
      "footer": "<https://icanhazdadjoke.com/j/1DQZvXvX8Ed|permalink> - <https://icanhazdadjoke.com|icanhazdadjoke.com>",
      "text": "My first time using an elevator was an uplifting experience. The second time let me down."
    }
  ],
  "response_type": "in_channel",
  "username": "icanhazdadjoke"
}
```
We are interested in the **_text_** part in the response, so extract it using JS and replace with your HTML and show it to the extension.
