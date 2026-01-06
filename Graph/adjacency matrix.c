#include <stdio.h>
#include <string.h>

int main()
{
    int n, m;
    scanf("%d %d", &n, &m);
    char type[20];
    scanf("%s", type);
    int adj[n][n];
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < n; j++)
        {
            adj[i][j] = 0;
        }
    }

    for(int i = 0; i < m; i++)
    {
        int u, v;
        scanf("%d %d", &u, &v);

        if(strcmp(type, "undirected") == 0)
        {
            adj[u][v] = 1;
            adj[v][u] = 1;
        }
        else   // directed graph
        {
            adj[u][v] = 1;
        }
    }
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < n; j++)
        {
            printf("%d", adj[i][j]);
            if(j < n - 1)
                printf(" ");
        }
        printf("\n");
    }
    return 0;
}
