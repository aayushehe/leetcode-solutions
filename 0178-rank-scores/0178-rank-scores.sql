select Score, DENSE_RANK() OVER (order by Score desc) as 'rank' from Scores;
