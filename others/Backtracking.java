public class Backtracking
{
	public static void main(String args[])
	{
		boolean[][] maze = {
				{true, true, true},
				{true, true, true},
				{true, true, true}
			};

		backtrack("",0,0,maze);

	}

	static void backtrack(String p, int r, int c, boolean[][] maze)
	{
		if(r == maze.length-1 && c == maze[0].length-1)
		{
			System.out.println(p);
			return;
		}

		if(!maze[r][c])
		{
			return;
		}

		maze[r][c]=false;
		
		if(r<maze.length-1)
		{
			backtrack(p + 'd', r+1,c,maze);
		}

		if(c<maze[0].length-1)
		{
			backtrack(p + 'r', r,c+1,maze);
		}

		if(r>0)
		{
			backtrack(p + 'U', r-1, c, maze);
		}

		if(c>0)
		{
			backtrack(p + 'l',r, c-1,maze);
		}


		maze[r][c] = true;
	}
}