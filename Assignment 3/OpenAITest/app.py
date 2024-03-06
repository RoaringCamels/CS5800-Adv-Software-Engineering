from flask import Flask, render_template, request
import openai

app = Flask(__name__)

# Set your OpenAI API key
openai.api_key = "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"

def chat_with_chatgpt(prompt, model="gpt-3.5-turbo"):
    response = openai.ChatCompletion.create(
        model = model, # Specifies the GPT model to use

        # Create a conversational context for the model
        messages =[
        {"role": "system", "content": "You are a helpful assistant."},
        {"role": "user", "content": prompt},
        ],
        
        max_tokens = 100, # Specifies the maximum number of tokens (words or characters) in the generated completion
        n = 1, # Requests only 1 completion from the model
        stop = None, # Specifies a stopping condition for the model. 'None' means it will hit max_token as the limit
        temperature = 0.5, # Controls the randomness of the model's output. Lower = more focused, Higher = more random
    )
    
    # Picks the first and only choice in the list
    # 'text.strip' removies leading and trailing whitespaces
    message = response['choices'][0]['message']['content'].strip()
    return message

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/generate_keywords', methods=['POST'])
def generate_keywords():
    if request.method == 'POST':
        # Use request.form.get() to avoid KeyError
        url_link = request.form.get('url_link')

        if url_link:
            question = "Write me keywords given "
            input_text = question + url_link

            # Call your function to get keywords
            keywords = chat_with_chatgpt(input_text)

            return render_template('result.html', keywords=keywords)

    # Handle the case where the form is not submitted correctly
    return "Invalid request"



if __name__ == '__main__':
    app.run(debug=True)
