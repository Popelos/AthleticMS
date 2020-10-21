<%-- 
    Document   : header
    Created on : Oct 18, 2020, 11:43:39 PM
    Author     : popelos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            *{
                box-sizing: border-box;
                margin:0;
                padding:0;

            }
            header{
                background-color: #0f3057;
                display: flex;
                font-size: 1.2rem;
                justify-content: space-between;
                align-items: center;
                margin: 0px;
                padding: 30px 10%;
                margin-bottom: 180px;
            }
            ul{list-style:none;}

            #logo{align-self: center; 
                  color:white;
                  font-size: 2.4rem;
            }
            .nav__links {
                list-style: none;
            }

            .nav__links li {
                display: inline-block;
                padding: 0px 20px;
            }

            .nav__links li a {
                transition: all 0.3 ease 0s;
            }

            .nav__links li a:hover {
                color:#0088a9
            }
            li, a, button {
                font-family: sans-serif;
                font-weight: 500;
                color: #edf0f1;
                text-decoration: none;
            }
        </style>

    </head>
    <body>
        <header>
            <h1 id="logo">Sports administration</h1>
            <nav class="nav__links">
                <ul>
                    <li><a href="/AthleticMS/ListAthleteServlet">Athletes</a></li>
                    <li><a href="/AthleticMS/ListCoachServlet">Coaches</a></li>
                    <li><a href="/AthleticMS/ListTeamServlet">Teams</a></li>
                    <li><a href="/AthleticMS/ListStadiumServlet">Stadiums</a></li>
                    <li><a href="/AthleticMS/ListGamesServlet">Games</a></li>
                    <li><a href="/AthleticMS/ListPerformanceServlet">Performance</a></li>
                    <li><a href="/AthleticMS/ListTrainingsServlet">Trainings</a></li>
                </ul>
            </nav>
        </header>
    </body>
</html>
