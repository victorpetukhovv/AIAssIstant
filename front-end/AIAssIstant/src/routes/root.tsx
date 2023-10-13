import { Link } from "react-router-dom";

export default function Root() {
  return (
    <>
      <Link to={`/login`} className="btn btn-primary">
        Start
      </Link>
    </>
  );
}
