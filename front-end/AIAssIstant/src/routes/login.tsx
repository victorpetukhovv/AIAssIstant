import LoginForm from "../components/LoginForm";
import { Link } from "react-router-dom";
import { useState } from "react";

export default function Login() {
  const [errorMessage, setErrorMessage] = useState<string | null>(null);
  return (
    <>
      {errorMessage && <div className="error">{errorMessage}</div>}
      <LoginForm setErrorMessage={setErrorMessage} />
      <Link to={`/`} className="btn btn-primary">
        Back
      </Link>
    </>
  );
}
