import { useState } from "react";
import { Routes, Route } from "react-router-dom";
import Header from "./components/Header";
import Footer from "./components/Footer";
import PageWrapper from "./components/PageWrapper";
import Home  from "./pages/Home";
import Contact  from "./pages/Contact";
import Details from "./pages/Details";
import NotFound  from "./pages/NotFound";

import UserInfoContext from "./UserInfoContext";
import Reducer from "./pages/Reducer/Reducer";





function App() {
  const [userInfo, setUserInfo] = useState({ name: "Thiago" });


  return (
    <UserInfoContext.Provider value={[userInfo, setUserInfo]}>
      <Header />
      <PageWrapper>        
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/contact" element={<Contact />} />
          <Route path="/details/:batata" element={<Details />} />
          <Route path="/reducer" element={<Reducer />}/>
          <Route path="*" element={<NotFound />} />          
        </Routes>
      </PageWrapper>
      <Footer />
    </UserInfoContext.Provider>
  );
}

export default App;