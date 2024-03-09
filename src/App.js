import { Container, Row, Col } from "react-bootstrap";
//import { Routes, Route } from "react-router-dom";
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

import "./App.css";
import Home from "./components/Home";
import Login from "./components/Login";
import Signup from "./components/Signup";
import ProtectedRoute from "./components/ProtectedRoute";
import { UserAuthContextProvider } from "./context/UserAuthContext";
import JoinQuiz from "./components/JoinQuiz";
import Logout from "./components/Logout";
import QuizPlay from "./components/QuizPlay";

function App() {
  return (
    <Container style={{ width: "400px" }}>
      <Row>
        <Col>
          <UserAuthContextProvider>
            <Router>
              <Routes>
                <Route
                  path="/home"
                  element={<ProtectedRoute><Home /></ProtectedRoute>}
                />
                <Route path="/" element={<Login />} />
                <Route path="/signup" element={<Signup />} />
                <Route path="/joinQuiz" element={<JoinQuiz/>}/>
                <Route path="/logout" element={<Logout/>}/>
                <Route path="/QuizPlay" element={<QuizPlay/>}/>
              </Routes>
            </Router>
          </UserAuthContextProvider>
        </Col>
      </Row>
    </Container>
  );
}

export default App;
