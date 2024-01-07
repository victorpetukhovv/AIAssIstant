import React from "react";
import ReactDOM from "react-dom/client";
import LoginForm from "./routes/login.tsx";
import Root from "./routes/root";
import ErrorPage from "./components/ErrorPage";
import "./index.css";
import { createBrowserRouter, RouterProvider } from "react-router-dom";

const router = createBrowserRouter([
  {
    path: "/",
    element: <Root />,
    errorElement: <ErrorPage />,
  },
  {
    path: "/login",
    element: <LoginForm />,
    errorElement: <ErrorPage />,
    loader: async () => {
      return fetch("http://localhost:8080/hello-world")
        .then((response) => response.json())
        .then((data) => console.log(data));
    },
  },
]);

ReactDOM.createRoot(document.getElementById("root")!).render(
  <React.StrictMode>
    <RouterProvider router={router} />
  </React.StrictMode>
);
