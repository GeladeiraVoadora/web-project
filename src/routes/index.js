import {Route,BrowserRouter,Routes} from "react-router-dom"

export default function ApplicationRoutes(){
    return(
      <BrowserRouter> 
        <Routes>
           <Route path="/" element={<h1>Home</h1>} /> 
           <Route path="/edital" element={<h1>Edital</h1>} /> 

        </Routes>
      </BrowserRouter>
    )
}