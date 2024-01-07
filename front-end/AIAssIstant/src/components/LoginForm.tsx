import { Form } from "react-router-dom";
import { useRef } from "react";

interface LoginFormProps {
  setErrorMessage: React.Dispatch<React.SetStateAction<string | null>>;
}

export default function LoginForm({ setErrorMessage }: LoginFormProps) {
  const usernameRef = useRef<HTMLInputElement>(null); // Define the username variable using useRef
  const passwordRef = useRef<HTMLInputElement>(null); // Define the password variable using useRef

  const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
    event.preventDefault();
    const username: any = usernameRef.current;
    const password: any = passwordRef.current;
    if (
      username &&
      password &&
      username.value === "" &&
      password.value === ""
    ) {
      console.log("I am expecting an username and a password!");
      setErrorMessage("I am expecting an username and a password!");
    } else if (username && username.value === "") {
      console.log("I am expecting an username!");
      setErrorMessage("I am expecting an username!");
    } else if (password && password.value === "") {
      console.log("I am expecting a password!");
      setErrorMessage("I am expecting a password!");
    } else {
      console.log("Username is valid!", username);
    }
  };

  return (
    <Form method="post" action="/events" onSubmit={handleSubmit}>
      <input type="text" id="username" name="username" ref={usernameRef} />
      <input type="password" name="password" ref={passwordRef} />
      <button type="submit">Log In</button>
    </Form>
  );
}
